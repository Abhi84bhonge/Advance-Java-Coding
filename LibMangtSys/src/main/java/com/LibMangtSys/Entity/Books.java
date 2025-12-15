package com.LibMangtSys.Entity;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Entity
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bid;

	@Column(nullable = false, unique = true)
	private String title;

	@Column(nullable = false, unique = true)
	private String isbn;

	@Column(nullable = false)
	private double price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id",nullable=false)
	private Author author;

	@ManyToMany
	@JoinTable(name = "book_borrower", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "borrower_id"))
	private Set<Borrower> borrower;

}
