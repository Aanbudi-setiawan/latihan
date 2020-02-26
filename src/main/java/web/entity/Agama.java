package web.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "master_agama")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agama {
	
	@Id
	@GenericGenerator(name = "agama_id", strategy = "uuid2")
	@GeneratedValue(generator = "agama_id")
	@Column(name = "id", nullable = false, length = 50, unique = true)
	private String id;
	
	@Column(name = "nama_agama", length = 50, nullable = false, unique = true)
	private String nama;
	
	@Column(name = "deskripsi", length = 200)
	private String deskripsi;
	
	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;
	
	@Column(name = "created_by", length = 50)
	private String createdBy;
	
}
