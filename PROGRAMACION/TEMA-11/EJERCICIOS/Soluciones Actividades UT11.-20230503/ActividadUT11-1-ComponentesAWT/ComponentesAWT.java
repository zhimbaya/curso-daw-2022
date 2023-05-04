import java.awt.*;

public class ComponentesAWT extends Frame {

  public ComponentesAWT() {

    setTitle( "Componentes AWT" );
    setSize( 400,250 );


    Panel bottomPanel = new Panel();
    Panel centerPanel = new Panel();
    MenuBar mb = new MenuBar();
    Menu m = new Menu( "Menú" );
    m.add( new MenuItem( "Menú Selección 1" ) );
    m.add( new CheckboxMenuItem( "Menú Selección 2" ) );
    m.add( new MenuItem( "Menú Selección 3" ) );
    mb.add( m );
    setMenuBar( mb );

    // Incoporamos los elementos pequeños en la zona inferior
    bottomPanel.add( new TextField( "Campo de Texto" ) );
    bottomPanel.add( new Button( "Botón" ) );
    bottomPanel.add( new Checkbox( "Casilla Verificación" ) );

    Choice c = new Choice();
    c.addItem( "Selección Item 1" );
    c.addItem( "Selección Item 2" );
    c.addItem( "Selección Item 3" );
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

    // En la columna derecha colocamos una lista de selección
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



