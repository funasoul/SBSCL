# The Systems Biology Simulation Core Library  <img align="right" src="https://draeger-lab.github.io/SBSCL/images/SCL_icon.png"> 

[![License (LGPL version 3)](https://img.shields.io/badge/license-LGPLv3.0-blue.svg?style=plastic)](http://opensource.org/licenses/LGPL-3.0)
[![Latest version](https://img.shields.io/badge/Latest_version-2.0-brightgreen.svg?style=plastic)](https://github.com/draeger-lab/SBSCL/releases/)
[![DOI](https://img.shields.io/badge/DOI-10.1186%2F1752--0509--7--55-blue.svg?style=plastic)](https://doi.org/10.1186/1752-0509-7-55)
[![Build Status](https://travis-ci.com/draeger-lab/SBSCL.svg?branch=master&style=plastic)](https://travis-ci.com/draeger-lab/SBSCL)

*Authors*: [Roland Keller](https://github.com/RolandKeller5), [Andreas Dräger](https://github.com/draeger), [Hemil Panchiwala](https://github.com/hemilpanchiwala), [Shalin Shah](https://github.com/shalinshah1993), [Matthias König](https://github.com/matthiaskoenig), [Alexander Dörr](https://github.com/a-doerr), [Richard Adams](https://github.com/otter606)

*Contributors to predecessor projects:* Philip Stevens, Marcel Kronfeld, Sandra Saliger, Simon Schäfer, Dieudonné Motsou Wouamba, Hannes Borch, Nicolas Le Novère, Max Zwiessele

### Description
The Systems Biology Simulation Core Library (SBSCL) provides an efficient and exhaustive Java™ implementation of methods to interpret the content of models encoded in the Systems Biology Markup Language ([SBML](http://sbml.org)) and its numerical solution. This library is based on the [JSBML](http://sbml.org/Software/JSBML) project and can be used on every operating system for which a Java Virtual Machine is available. Please note that this project does not contain any user interface, neither a command-line interface, nor a graphical user interface. This project has been developed as a pure programming library. To support the [MIASE](http://co.mbine.org/standards/miase) effort, it understands [SED-ML](http://sed-ml.org) files. Its abstract type and interface hierarchy facilitates the implementation of further community standards, such as [CellML](https://www.cellml.org).

When using this library, please cite: http://www.biomedcentral.com/1752-0509/7/55.

### Categories
Bio-Informatics, Libraries, Simulations

### Features
- Numerical simulation
- Ordinary differential equation solver
- Time-course analysis
- Application programming interface
- Systems Biology Markup Language support along with `fbc` and `comp` extensions
- Stochastic simulations support
- Simulation Experiment Description Markup Language (SED-ML) support

### Supported Packages
- Systems Biology Markup Language (L1V1 - L3V2)
- SBML models with FBC V1 and V2
- SBML models with comp extensions
- Simulation Experiment Description Markup Language (L1V3)
- COMBINE archive and OMEX format
- All models from [SBML Test Suite](https://github.com/sbmlteam/sbml-test-suite/tree/master/cases/semantic) and [BiGG models](https://github.com/matthiaskoenig/bigg-models-fba)
- All models from [Stochastic Test Suite](https://github.com/sbmlteam/sbml-test-suite/tree/master/cases/stochastic)

## Getting started

### For users
For an introduction on how to use this library for simulation, please refer to the [UserGuidelines.md](UserGuidelines.md) file. There you can find explanations on how to simulate different models and code snippets, including the links to the complete code examples.

### For developers
To start working on SBSCL, you should first clone the repository and then refer to [INSTALL.md](INSTALL.md) which gives instruction to run maven build. Once a maven build is ran, the binaries will be generated in the target folder. This folder will also include a JAR files of the simulation core library to work with. 

For an introduction on how things currently work in SBSCL to simulate different models, please refer to the sequence diagrams present in the [/dev/diagrams/](https://github.com/draeger-lab/SBSCL/tree/master/dev/diagrams/) where you can understand complete workflow of the library. Once you get familiarized with how things work, please open the javadoc [homepage](https://draeger-lab.github.io/SBSCL/apidocs/overview-summary.html) where you can find the complete information about the library properly documented. For formatting the code-base, please refer to [formatting-guidelines](https://github.com/draeger-lab/SBSCL/tree/master/dev/formatting-guidelines/).

## File structure

Just a brief explanation of the folders and files contained in this distribution.

Most importantly, see 
 * the [`INSTALL.md`](INSTALL.md) file for instruction to run maven build
 * the docs folder containing an exhaustive documentation under apidocs

The package structure in more detail:
```
 /
 |- dev                 -> Contains the diagrams and fomatting-guidelines for the developers
 |- docs                -> Contains code for the maven built website
 |- modules             -> Contains the code for support of cellDesigner and cytoscape in FERN
 |- src                 -> The main source folder containing all the code and test files
    |- assembly         -> assembly files for maven plugins
    |- lib              -> 3rd party libraries needed for compilation and execution
    |- main             -> Core java files of simulation library
    |- test             -> JUnit test files along with resources required
    |- site             -> Contains markup files, old javadoc, site.xml and other website 
                            resources 
 |- LICENSE.txt         -> the license, under which this project is distributed
 |- pom.xml             -> Maven file for building the project
 |- README.md           -> this file
 |- UserGuidelines.md   -> Contains the guidelines for using the features of library
```

## Troubleshooting

Please e-mail any bugs, problems, suggestions, or issues regarding this library to the bug tracker at https://github.com/draeger-lab/SBSCL/issues

## Licensing terms

This file is part of Simulation Core Library, a Java-based library for efficient numerical simulation of biological models.

Copyright (C) 2007 jointly held by the individual authors.

This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation. A copy of the license agreement is provided in the file named [LICENSE.txt](LICENSE.txt) included with this software distribution and also available online as http://www.gnu.org/licenses/lgpl-3.0-standalone.html.

Please cite the original work and the authors when using this program. See the [project homepage](https://draeger-lab.github.io/SBSCL/) for details.
