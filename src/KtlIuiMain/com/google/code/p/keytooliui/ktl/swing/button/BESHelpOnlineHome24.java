/*
 *
 * Copyright (c) 2001-2011 keyTool IUI Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 * This software is the confidential and proprietary information of RagingCat Project.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of RagingCat Project's license agreement.
 *
 * THE SOFTWARE IS PROVIDED AND LICENSED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 *
 * LICENSE FOR THE SOFTWARE DOES NOT INCLUDE ANY CONSIDERATION FOR ASSUMPTION OF RISK
 * BY KEYTOOL IUI PROJECT, AND KEYTOOL IUI PROJECT DISCLAIMS ANY AND ALL LIABILITY FOR INCIDENTAL
 * OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF OR INABILITY
 * TO USE THE SOFTWARE, EVEN IF KEYTOOL IUI PROJECT HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 */

/*
 *  @author bantchao
 */

package com.google.code.p.keytooliui.ktl.swing.button;

import com.google.code.p.keytooliui.shared.swing.menuitem.MIHelpOnlineHome;


final public class BESHelpOnlineHome24 extends BESHelpOnlineAbs
{
    // --------------------
    // FINAL STATIC PRIVATE
    
    final static private String _STR_NAME_ICON = "webcomponent24.gif";
    
    // ------
    // PUBLIC
        
    public BESHelpOnlineHome24(java.awt.Component cmpFrameOwner, String strTitleApplication)
    {
        
        super(
            cmpFrameOwner,
            strTitleApplication,
            BESHelpOnlineHome24._STR_NAME_ICON,
            MIHelpOnlineHome.STR_TEXT,
            24,
            MIHelpOnlineHome.STR_URL
         );
    }
}