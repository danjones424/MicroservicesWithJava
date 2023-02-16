package com.danjones;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Member {

    @Id
    @SequenceGenerator(
            name = "member_id_sequence",
            sequenceName = "member_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_id_sequence"
    )
    private Integer id;
    private String name;
    private String tier;
    private Integer subscribedYears;

    public Member(Integer id,
                  String name,
                  String tier,
                  Integer subscribedYears) {
        this.id = id;
        this.name = name;
        this.tier = tier;
        this.subscribedYears = subscribedYears;
    }

    public Member() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Integer getSubscribedYears() {
        return subscribedYears;
    }

    public void setSubscribedYears(Integer subscribedYears) {
        this.subscribedYears = subscribedYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(tier, member.tier) && Objects.equals(subscribedYears, member.subscribedYears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tier, subscribedYears);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier='" + tier + '\'' +
                ", subscribedYears=" + subscribedYears +
                '}';
    }
}
