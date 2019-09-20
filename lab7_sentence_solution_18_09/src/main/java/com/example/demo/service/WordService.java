package com.example.demo.service;

import com.example.demo.domain.*;

public interface WordService {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();

}