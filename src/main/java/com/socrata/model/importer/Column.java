package com.socrata.model.importer;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Column
{
    private static final String[] RESERVED_FIELD_NAMES = { "_id", "_uuid", "_position", "_address" };

    int id;
    String name;
    String fieldName;
    String description;
    String dataTypeName;
    int position;
    Integer width;

    public int getId()
    {
        return id;
    }

    private void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFieldName()
    {
        return fieldName;
    }

    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDataTypeName()
    {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName)
    {
        this.dataTypeName = dataTypeName;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public Integer getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

}