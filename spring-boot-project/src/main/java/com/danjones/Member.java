package com.danjones;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Member {

    @Id
    @SequenceGenerator(
            name = "member_id_sequence",
            sequenceName = "member_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_id_sequence"
    )
    private Integer id;
    private String name;
    private String tier;
    private String email;

    public Member(Integer id,
                  String name,
                  String tier,
                  String email) {
        this.id = id;
        this.name = name;
        this.tier = tier;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(tier, member.tier) && Objects.equals(email, member.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tier, email);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier='" + tier + '\'' +
                ", email=" + email +
                '}';
    }
}
