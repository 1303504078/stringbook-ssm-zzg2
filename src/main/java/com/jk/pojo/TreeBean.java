package com.jk.pojo;


import java.util.List;

public class   TreeBean {
	
	private Integer id;
	private String text;
	private List<TreeBean> nodes;	
	private Integer pid;
	private String href;
	private Boolean selectable;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<TreeBean> getNodes() {
		return nodes;
	}
	public void setNodes(List<TreeBean> nodes) {
		this.nodes = nodes;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Boolean getSelectable() {
		return selectable;
	}
	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}
	
    
	
}
