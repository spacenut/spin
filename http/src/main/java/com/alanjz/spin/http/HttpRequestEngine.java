package com.alanjz.spin.http;

/*
    ____/ ___ \   /  __  \
   __  ) /__/ /  /  / /  /
 _____/  ____/__/__/ /__/  (c)
      __/

A P2P distributed compute and storage framework.
Copyright (C) 2015 Alan J. Zaffetti

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import com.alanjz.spin.util.engine.mpi.RequestEngine;

/**
 *
 */
public class HTTPRequestEngine implements RequestEngine {

  /**
   *
   */
  private static final HTTPRequestEngine instance = new HTTPRequestEngine();

  @Override
  public void handleRequest(String requestText) throws Exception {

  }

  /**;
   *
   * @return
   */
  static HTTPRequestEngine getInstance() {
    return instance;
  }
}
