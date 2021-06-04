package com.eya.hotel2.entities;


import javax.persistence.*;
@Entity

@Table(name = "image_table")

public class ImageModel {
	
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
     private String name;

    @Column(name = "type")
    private String type;

    //image bytes can have large lengths so we specify a value

    //which is more than the default length for picByte column
    @Lob
    @Column(name = "image", length = 1000)
    private byte[] image;
  public ImageModel() {

        super();

    }

   public ImageModel(String name, String type, byte[] image) {

        this.name = name;
         this.type = type;
        this.image = image;

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getType() {

        return type;

    }

   public void setType(String type) {

        this.type = type;

    }
    public byte[] getImage() {

        return image;

    }

    public void setImage(byte[] image) {
       this.image = image;

    }

}