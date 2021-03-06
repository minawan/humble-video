/*******************************************************************************
 * Copyright (c) 2014, Art Clarke.  All rights reserved.
 *  
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package io.humble.video.demos;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Test;

/**
 * @author aclarke
 *
 */
public class RecordAndEncodeVideoTest {
  /**
   * Simple test to make sure no exceptions are generated by main method.
   * 
   * You should hand-verify the printed results.
   */
  @Test
  public void testMain() throws InterruptedException, IOException, AWTException {
    String headless = System.getProperty("java.awt.headless");
    
    if (headless != null && Boolean.parseBoolean(headless))
      // skip this test on headless machines.
      return;
    
    final String[] args = new String[]{this.getClass().getCanonicalName()+".testMain.mp4"};
    RecordAndEncodeVideo.main(args);
  }

}
