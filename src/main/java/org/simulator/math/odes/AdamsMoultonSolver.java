/*
 * $Id$
 * $URL$
 * ---------------------------------------------------------------------
 * This file is part of Simulation Core Library, a Java-based library
 * for efficient numerical simulation of biological models.
 *
 * Copyright (C) 2007-2016 jointly by the following organizations:
 * 1. University of Tuebingen, Germany
 * 2. Keio University, Japan
 * 3. Harvard University, USA
 * 4. The University of Edinburgh, UK
 * 5. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK
 * 6. The University of California, San Diego, La Jolla, CA, USA
 * 7. The Babraham Institute, Cambridge, UK
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation. A copy of the license
 * agreement is provided in the file named "LICENSE.txt" included with
 * this software distribution and also available online as
 * <http://www.gnu.org/licenses/lgpl-3.0-standalone.html>.
 * ---------------------------------------------------------------------
 */
package org.simulator.math.odes;

import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;

/**
 * This class is a wrapper for the Adams-Moulton solver in the
 * <a href="http://commons.apache.org/proper/commons-math/" target="_blank">Apache Math
 * Library</a>.
 *
 * @author Roland Keller
 * @version $Rev$
 * @since 0.9
 */
public class AdamsMoultonSolver extends FirstOrderSolver {

  /**
   * Generated serial version identifier.
   */
  private static final long serialVersionUID = -2601862472447650296L;

  /**
   *
   */
  public AdamsMoultonSolver() {
    super();
  }

  /**
   * clone constructor
   *
   * @param adamsSolver
   */
  public AdamsMoultonSolver(AdamsMoultonSolver adamsSolver) {
    super(adamsSolver);
    integrator = adamsSolver.getIntegrator();
  }

  /**
   * @param stepSize
   */
  public AdamsMoultonSolver(double stepSize) {
    super(stepSize);
  }

  /**
   * @param stepSize
   * @param nonnegative the nonnegative flag of the super class
   * @see AbstractDESSolver
   */
  public AdamsMoultonSolver(double stepSize, boolean nonnegative) {
    super(stepSize, nonnegative);
  }

  /* (non-Javadoc)
   * @see org.sbml.simulator.math.odes.FirstOrderSolver#clone()
   */
  @Override
  public AdamsMoultonSolver clone() {
    return new AdamsMoultonSolver(this);
  }

  /* (non-Javadoc)
   * @see org.sbml.simulator.math.odes.FirstOrderSolver#createIntegrator()
   */
  @Override
  protected void createIntegrator() {
    integrator = new AdamsMoultonIntegrator(5, Math.min(1e-8, Math.min(1.0, getStepSize())),
        Math.min(1.0, getStepSize()), getAbsTol(), getRelTol());
  }

  /* (non-Javadoc)
   * @see org.sbml.simulator.math.odes.AbstractDESSolver#getName()
   */
  @Override
  public String getName() {
    return "Adams-Moulton solver";
  }

  /* (non-Javadoc)
   * @see org.simulator.math.odes.DESSolver#getKISAOTerm()
   */
  @Override
  public int getKiSAOterm() {
    return 280;
  }
}
