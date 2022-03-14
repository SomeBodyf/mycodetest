package com.somebody.db;

import java.util.List;

import beans.Centers;
import beans.Equipments;

public interface MapperYoung {
	public int is(Centers ct);
	public List<Equipments> goodsList(Equipments eq);
	public List<Equipments> searchGoods(Equipments eq);
	public List<Equipments> getGoCaList(Equipments eq);
	public List<Equipments> getGoStList(Equipments eq);
	public List<Equipments> getGoSfList(Equipments eq);
	public int modGoods(Equipments eq);
	public int modGoodsMg(Equipments eq);
	public List<Equipments> getGoodsCodeE1(Equipments eq);
	public List<Equipments> getGoodsCodeE2(Equipments eq);
	public List<Equipments> getGoodsCodeE3(Equipments eq);
	public int inseq(Equipments eq);
	public int inseg(Equipments eq);
}
