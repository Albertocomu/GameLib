package com.carveras.gamelibrary.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.carver_as.carverjsf.model.Nameable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Empresa extends Nameable
{
}
