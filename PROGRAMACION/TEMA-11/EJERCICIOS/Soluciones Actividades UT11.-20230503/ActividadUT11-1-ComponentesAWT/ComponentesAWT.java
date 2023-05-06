import java.awt.*;

public class ComponentesAWT extends Frame {

  public ComponentesAWT() {

    setTitle( "Componentes AWT" );
    setSize( 400,250 );


    Panel bottomPanel = new Panel();
    Panel centerPanel = new Panel();
    MenuBar mb = new MenuBar();
    Menu m = new Menu( "Men�" );
    m.add( new MenuItem( "Men� Selecci�n 1" ) );
    m.add( new CheckboxMenuItem( "Men� Selecci�n 2" ) );
    m.add( new MenuItem( "Men� Selecci�n 3" ) );
    mb.add( m );
    setMenuBar( mb );

    // Incoporamos los elementos peque�os en la zona inferior
    bottomPanel.add( new TextField( "Campo de Texto" ) );
    bottomPanel.add( new Button( "Bot�n" ) );
    bottomPanel.add( new Checkbox( "Casilla Verificaci�n" ) );

    Choice c = new Choice();
    c.addItem( "Selecci�n Item 1" );
    c.addItem( "Selecci�n Item 2" );
    c.addItem( "Selecci�n Item 3" );
    bottomPanel.add( c );

    // En la zona central colocamos los elementos mayores
    centerPanel.setLayout( new GridLayout( 1,2 ) );


    // En la zona central colocamos una etiqueta y una zona de texto
    Panel p = new Panel();
    p.setLayout( new BorderLayout() );
    p.add( "North",new Label( "Etiqueta",Label.CENTER ) );
    p.add( "Center",new TextArea( "Zona de Texto",5,20 ) );
    centerPanel.add( p );

    setLayout( new BorderLayout() );
    add( "South",bottomPanel );
    add( "Center",centerPanel );

    // En la columna derecha colocamos una lista de selecci�n
    List l = new List( 3,false );
    l.add( "Lista item 1");
    l.add( "Lista item 2");
    l.add( "Lista item 3");
    l.add( "Lista item 4");
    l.add( "Lista item 5");
    l.add( "Lista item 6");
    l.add( "Lista item 7");
    l.add( "Lista item 8");
    l.add( "Lista item 9");
    add( "East",l );


    setVisible( true );
    //registramos
    addWindowListener(new CerrarVentana());
    }


  public static void main( String args[] ) {
    ComponentesAWT ventana = new ComponentesAWT();
     }
  }



