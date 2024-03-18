package sim.backend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
@Entity
@AllArgsConstructor //모든필드 매개변수 받는 생성자
@NoArgsConstructor // 기본생성자
@Data // getter,setter 메소드 자동생성 + toString,equals,hasCode
@SequenceGenerator(name="BOARD_SEQ_GENERATOR", sequenceName = "BOARD_SEQ",initialValue = 1, allocationSize = 1)
public class Board {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR") //JDA Oracle일경우 추가
    @Id
    private int seq;
    private String writer;
    private String email;
    private String subject;
    private String content;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Seoul")
    @CreationTimestamp//SQL문을 사용하지못해서 ex = SYSDATE
    @Column(name = "rdate", updatable = false)
    private Date rdate;

    //@UpdateTimestamp // 엔티티 업데이트 시점의 날짜를 자동으로 설정
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "update")
    //private Date update;
}
