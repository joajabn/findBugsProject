package pl.paniodprogramowania.findBugsProject.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.PreferredDance;

@Entity
@Table(name = "dancers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DancerEntity {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long dancerId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    @Enumerated(EnumType.STRING)
    private PreferredDance preferredDance;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "primaballerina")
    private Set<DancePlayEntity> dancePlays;


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
