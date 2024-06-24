package com.amo.meet.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.amo.meet.enums.Check;
import com.amo.meet.enums.Gender;
import com.amo.meet.enums.MBTI;
import com.amo.meet.enums.Marry;
import com.amo.meet.enums.converter.CheckConverter;
import com.amo.meet.enums.converter.GenderConverter;
import com.amo.meet.enums.converter.MBTIConverter;
import com.amo.meet.enums.converter.MarryConverter;

@Entity
@Table(name = "USER", indexes = { @Index(columnList = "USER_ID") })
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UUID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uuid;

	@NotNull
	@Column(name = "USER_ID")
	private String userId;

	@NotNull
	@Column(name = "PASSWORD")
	private String password;

	@NotNull
	@Column(name = "NAME")
	private String name;

	@NotNull
	@Column(name = "NICK_NAME")
	private String nickname;

	@NotNull
	@Column(name = "GENDER")
	@Convert(converter = GenderConverter.class)
	private Gender gender;

	@NotNull
	@Column(name = "BIRTH")
	private String birth;

	@NotNull
	@Column(name = "HEIGHT")
	private Integer height;

	@NotNull
	@Column(name = "RELIGION")
	private String religion;

	// cate 분류해서 코드로 관리가 나을 듯
	@NotNull
	@Column(name = "JOB")
	private String job;

	@NotNull
	@Column(name = "SALARY")
	private int salary;

	@NotNull
	@Column(name = "EDUCATION")
	private String education;

	@NotNull
	@Column(name = "IMAGES")
	private String images;

	@NotNull
	@Column(name = "MAIL")
	private String mail;

	@NotNull
	@Column(name = "PHONE")
	private String phone;

	// 자기소개
	@NotNull
	@Column(name = "INTRO")
	private String intro;

	@Column(name = "MBTI", length = 4)
	@Convert(converter = MBTIConverter.class)
	private MBTI mbti;

	@Column(name = "ALCOHOL", length = 5)
	@Convert(converter = CheckConverter.class)
	private Check alchol;

	@Column(name = "SMOKE", length = 5)
	@Convert(converter = CheckConverter.class)
	private Check smoke;

	@Column(name = "MARRIAGE")
	@Convert(converter = MarryConverter.class)
	private Marry marriage;

	// 공개 = 1, 비공개 = 0
	@NotNull
	@Column(name = "PRIVACY", length = 1, columnDefinition = "integer default 1")
	private int privacy;

	@Column(name = "SPARE")
	private String spare;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public MBTI getMbti() {
		return mbti;
	}

	public void setMbti(MBTI mbti) {
		this.mbti = mbti;
	}

	public Check getAlchol() {
		return alchol;
	}

	public void setAlchol(Check alchol) {
		this.alchol = alchol;
	}

	public Check getSmoke() {
		return smoke;
	}

	public void setSmoke(Check smoke) {
		this.smoke = smoke;
	}

	public Marry getMarriage() {
		return marriage;
	}

	public void setMarriage(Marry marriage) {
		this.marriage = marriage;
	}

	public int getPrivacy() {
		return privacy;
	}

	public void setPrivacy(int privacy) {
		this.privacy = privacy;
	}

	public String getSpare() {
		return spare;
	}

	public void setSpare(String spare) {
		this.spare = spare;
	}

}
