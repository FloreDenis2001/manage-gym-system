package ro.mycode.managegymsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Gym")
@Table(name = "gym")

public class Gym implements Comparable<Gym> {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private long id;
    private String name;
    private String type;
    private String describe;
    private String address;


    @Override
    public String toString() {
        String text = "Id : " + this.id + "\n";
        text += "Name : " + this.name + "\n";
        text += "Type : " + this.type + "\n";
        text += "Describe : " + this.describe + "\n";
        text += "Address : " + this.address + "\n";

        return text;
    }

    @Override
    public boolean equals(Object o) {
        Gym x = (Gym) o;
        return x.getName().compareTo(this.getName()) == 0;
    }


    @Override
    public int compareTo(Gym o) {
        if (o.getId() > this.getId()) {
            return 1;
        } else if (o.getId() < this.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
