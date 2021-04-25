package kz.iitu.lms.model;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
@Entity
@Data
public class Userbooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",updatable = false,insertable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)


    @JsonIgnore
    private User user;
    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id",updatable = false,insertable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    @JsonIgnore
    private Book book;
    @Column(name = "book_id")
    private Long bookId;

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Userbooks{" +
                "id=" + id +
                ", user=" + user +
                ", userId=" + userId +
                ", book=" + book +
                ", bookId=" + bookId +
                '}';
    }
}
