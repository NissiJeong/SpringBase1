package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor //모든 필드를 갖고 있는 생성자를 만들어 준다.
//@NoArgsConstructor //어떤 필드도 갖고 있지 않는 생성자를 만들어 준다. 즉, 기본생성자를 만들어주는 어노테이션
@RequiredArgsConstructor //파이털을 갖고 있는 필드를 갖고 있는 생성자를 만들어 준다.
public class Memo {
    private final String username;
    private String contents;
}