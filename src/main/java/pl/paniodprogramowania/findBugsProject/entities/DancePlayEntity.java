package pl.paniodprogramowania.findBugsProject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Table(name = "dance_play")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DancePlayEntity {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long dancePlayId;

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "primaballerina_id", referencedColumnName = "dancerId")
    private DancerEntity primaballerina;

    @Override
    public String toString() {
        return String.join(", ", String.valueOf(dancePlayId), title, String.valueOf(primaballerina.getDancerId()));
    }
}