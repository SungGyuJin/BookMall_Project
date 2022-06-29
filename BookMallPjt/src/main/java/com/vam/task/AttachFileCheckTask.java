package com.vam.task;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vam.mapper.AdminMapper;
import com.vam.model.AttachImageVO;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class AttachFileCheckTask {

	@Autowired
	private AdminMapper mapper;
	
private String getFolderYesterDay() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, -1);
		
		String str = sdf.format(cal.getTime());
		
		return str.replace("-", File.separator);
	}

	@Scheduled(cron="0 0 1 * * *")
	public void checkFiles() throws Exception{
		
		log.warn("File Check Task Run......");
		log.warn(new Date());
		log.warn("================================");
		
		// DB에 저장된 파일리스트
		List<AttachImageVO> fileList = mapper.checkFileList();
		
		// 비교 기준 팡리 리스트(Path객체)
		
	}
	
}
