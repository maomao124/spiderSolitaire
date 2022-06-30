package mao;

import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：蜘蛛纸牌
 * Package(包名): mao
 * Class(类名): AboutDialog
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/6/30
 * Time(创建时间)： 20:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class AboutDialog extends JDialog
{
    /**
     * The J main pane.
     */
    JPanel jMainPane = new JPanel();

    /**
     * The J tabbed pane.
     */
    JTabbedPane jTabbedPane = new JTabbedPane();
    private final JPanel jPanel1 = new JPanel();
    private final JPanel jPanel2 = new JPanel();

    private final JTextArea jt1 = new JTextArea("将电脑多次分发给你的牌按照相同的花色由大至小排列起来。直到桌面上的牌全都消失。");
    private final JTextArea jt2 = new JTextArea("该游戏中，纸牌的图片来自于Windows XP的纸牌游戏，图片权属于原作者所有！");

    /**
     * Instantiates a new About dialog.
     */
    /*
     **构造函数
     */
    public AboutDialog()
    {
        setTitle("蜘蛛牌");
        setSize(300, 200);
        //设置此对话框是否可以由用户调整大小
        setResizable(false);
        //设置用户在此对话框上启动“关闭”时默认发生的操作
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //获取屏幕宽度
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        //获取屏幕高度
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        //位于屏幕中央
        this.setLocation(screenWidth / 2 - this.getWidth() / 2, screenHeight / 2 - this.getHeight() / 2);

        Container c = this.getContentPane();

        //调整此组件的大小，使其具有宽度width和高度height
        jt1.setSize(260, 200);
        jt2.setSize(260, 200);

        //设置指定的布尔值以指示此TextComponent是否应可编辑。
        jt1.setEditable(false);
        jt2.setEditable(false);

        //设置文本区域的换行策略。如果设置为 true，如果行太长而无法容纳在分配的宽度内，则行将被换行。如果设置为 false，则将始终展开行。
        jt1.setLineWrap(true);
        jt2.setLineWrap(true);

        //设置当前字体。这将删除缓存的行高和列宽
        jt1.setFont(new Font("楷体_GB2312", java.awt.Font.BOLD, 13));
        //设置此组件的前景色。
        jt1.setForeground(Color.blue);

        //设置当前字体。这将删除缓存的行高和列宽
        jt2.setFont(new Font("楷体_GB2312", java.awt.Font.BOLD, 13));
        //设置此组件的前景色。
        jt2.setForeground(Color.black);

        //将指定的组件附加到此容器的末尾
        jPanel1.add(jt1);
        jPanel2.add(jt2);

        jTabbedPane.setSize(300, 200);
        jTabbedPane.addTab("游戏规则", null, jPanel1, null);
        jTabbedPane.addTab("声明", null, jPanel2, null);

        jMainPane.add(jTabbedPane);
        c.add(jMainPane);

        pack();
        this.setVisible(true);
    }
}

