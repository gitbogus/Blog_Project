package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
public class PostRequestDto {
    Integer id;
    String title;
    String content;
    String username;

    public Post getPost() {

        return new Post(this.id, this.title, this.content, this.username);
    }

}
