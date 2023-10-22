package com.cibertec.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "libro")
public class Libro {

	private String _id;

	private String title;
	private String isbn;
	private int pageCount;
	private LocalDateTime publishedDate;
	private String thumbnailUrl;
	private String shortDescription;
	private String longDescription;
	private String status;
	private List<String> authors;
	private List<String> categories;
	
	
}
