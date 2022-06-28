package com.vam.task;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.mapper.AdminMapper;
import com.vam.model.AttachImageVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TaskTest {

	@Autowired
	private AdminMapper mapper;
	
	@Test
	public void taskTests() {
		
		List<AttachImageVO> fileList = mapper.checkFileList()	;
		
		System.out.println("fileList : ");
		fileList.forEach(list -> System.out.println(list));
		System.out.println("============================================");
		
		List<Path> checkFilePath = new ArrayList<Path>();
		
		fileList.forEach(vo -> {
			
			Path path = Paths.get("C:\\upload", vo.getUploadPath(), vo.getUuid() + "_" + vo.getFileName());
			checkFilePath.add(path);
			
		});
		
		System.out.println("checkFilePath : ");
		checkFilePath.forEach(list -> System.out.println(list));
		System.out.println("============================================");
		
	}
	
	
	
}
