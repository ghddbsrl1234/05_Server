package edu.kh.jsp2.dto;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data // Getter + Setter + toString 
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든필드 초기화용생성자
public class Book {
	// 필드
	private String title; 	// 제목
	private String writer; 	// 저자
	private int price; 		// 가격

	
}