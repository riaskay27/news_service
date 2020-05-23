package ua.com.newsAPEPS.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String article;

    @Column(nullable = false)
    private String imgUrl;

    public News(String title,String article,String imgUrl) {
        this.title=title;
        this.article=article;
        this.imgUrl=imgUrl;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
