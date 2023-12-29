package weather;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class weatherC implements Initializable {
    

    @FXML
    private ComboBox<String> cb;
    @FXML
    private Button btn1;  

    @FXML
    private Pane alex;
    @FXML
    private Pane aswan;
    @FXML
    private Pane beni;
    @FXML
    private Pane cairo;
    @FXML
    private Pane dkhlia;
    @FXML
    private Pane demiat;
    @FXML
    private Pane bhira;
    @FXML
    private Pane fyom;
    @FXML
    private Pane ghr;
    @FXML
    private Pane giza;
    @FXML
    private Pane ismlia;
    @FXML
    private Pane ksh;
    @FXML
    private Pane lux;
    @FXML
    private Pane meno;
    @FXML
    private Pane mnia;
    @FXML
    private Pane mtroh;
    @FXML
    private Pane newvly;
    @FXML
    private Pane norths;
    @FXML
    private Pane port;
    @FXML
    private Pane kna;
    @FXML
    private Pane qlu;
    @FXML
    private Pane shrk;
    @FXML
    private Pane shag;
    @FXML
    private Pane ss;
    @FXML
    private Pane s;
    @FXML
    private Pane suez;

    @FXML
    private Label exit;
    @FXML
    private ImageView b2;
    @FXML
    private ImageView b3;
    
   
    private int currentIndex = 2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slideImages();
        String [] items ={"Cairo", "Alexandria", "Giza", "Qalyubia", "Port Said", "Suez", "Gharbia", "Dakahlia", "Asyut", "Fayoum", "Sharqia","Aswan", "Beheira", "Minya", "Damietta", "Luxor", "Qena", "Beni Suef", "Sohag", "Kafr el-Sheikh", "Monufia","Matruh", "New Valley" , "North Sainai"};
         cb.getItems().addAll(items);
        /* cb.setOnAction(event ->{
                String data = cb.getSelectionModel().getSelectedItem().toString();
                //To be connceted to the api
         });*/

        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        SliderAnimation();
       
    }
 
 
private void slideImages() {
    new Thread(() -> {
        try {
            while (true) {
                Thread.sleep(5000);

                Platform.runLater(() -> {
                    TranslateTransition slide = new TranslateTransition(Duration.seconds(5));
                    slide.setNode(getCurrentImageView());
                    
                    if (currentIndex == 2) {
                        slide.setNode(b2);
                        slide.setByX(-320);
                    } else if (currentIndex == 3) {
                        slide.setNode(b3);
                        slide.setByX(-320);
                    }
                    
                    slide.play();

                    slide.setOnFinished(event -> {
                        switchImage();
                        slide.setByX(320);
                        slide.play();
                    });
                });
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
}

private ImageView getCurrentImageView() {
    if (currentIndex == 2) {
        return b2;
    } else return b3;
    
}

private void switchImage() {
    currentIndex = (currentIndex % 3) + 1;
}

    private void SliderAnimation() {
        FadeTransition ft00 = new FadeTransition(Duration.seconds(6), suez);
        ft00.setFromValue(1.0);
        ft00.setToValue(0.0);
        ft00.play();
        ft00.setOnFinished(event00
                -> {
            FadeTransition ft99 = new FadeTransition(Duration.seconds(6), s);
            ft99.setFromValue(1);
            ft99.setToValue(0);
            ft99.play();
            ft99.setOnFinished(event99
                    -> {
                FadeTransition ft88 = new FadeTransition(Duration.seconds(6), ss);
                ft88.setFromValue(1);
                ft88.setToValue(0);
                ft88.play();
                ft88.setOnFinished(event88
                        -> {

                    FadeTransition ft77 = new FadeTransition(Duration.seconds(6), shag);
                    ft77.setFromValue(1);
                    ft77.setToValue(0);
                    ft77.play();
                    ft77.setOnFinished(event77
                            -> {
                        FadeTransition ft66 = new FadeTransition(Duration.seconds(6), shrk);
                        ft66.setFromValue(1);
                        ft66.setToValue(0);
                        ft66.play();
                        ft66.setOnFinished(event66
                                -> {
                            FadeTransition ft55 = new FadeTransition(Duration.seconds(6), qlu);
                            ft55.setFromValue(1);
                            ft55.setToValue(0);
                            ft55.play();
                            ft55.setOnFinished(event55
                                    -> {
                                FadeTransition ft44 = new FadeTransition(Duration.seconds(6), kna);
                                ft44.setFromValue(1);
                                ft44.setToValue(0);
                                ft44.play();
                                ft44.setOnFinished(event44
                                        -> {
                                    FadeTransition z = new FadeTransition(Duration.seconds(6), port);
                                    z.setFromValue(1);
                                    z.setToValue(0);
                                    z.play();
                                    z.setOnFinished(eventz
                                            -> {
                                        FadeTransition ft33 = new FadeTransition(Duration.seconds(6), norths);
                                        ft33.setFromValue(1);
                                        ft33.setToValue(0);
                                        ft33.play();
                                        ft33.setOnFinished(event33
                                                -> {
                                            FadeTransition ft22 = new FadeTransition(Duration.seconds(6), newvly);
                                            ft22.setFromValue(1);
                                            ft22.setToValue(0);
                                            ft22.play();
                                            ft22.setOnFinished(event22
                                                    -> {
                                                FadeTransition ft98 = new FadeTransition(Duration.seconds(6), mtroh);
                                                ft98.setFromValue(1);
                                                ft98.setToValue(0);
                                                ft98.play();
                                                ft98.setOnFinished(event98
                                                        -> {
                                                    FadeTransition ft97 = new FadeTransition(Duration.seconds(6), mnia);
                                                    ft97.setFromValue(1);
                                                    ft97.setToValue(0);
                                                    ft97.play();
                                                    ft97.setOnFinished(event97
                                                            -> {
                                                        FadeTransition ft96 = new FadeTransition(Duration.seconds(6), meno);
                                                        ft96.setFromValue(1);
                                                        ft96.setToValue(0);
                                                        ft96.play();
                                                        ft96.setOnFinished(event96
                                                                -> {

                                                            FadeTransition ft = new FadeTransition(Duration.seconds(6), lux);
                                                            ft.setFromValue(1);
                                                            ft.setToValue(0);
                                                            ft.play();
                                                            ft.setOnFinished(event
                                                                    -> {
                                                                FadeTransition ft1 = new FadeTransition(Duration.seconds(6), ksh);
                                                                ft1.setFromValue(1);
                                                                ft1.setToValue(0);
                                                                ft1.play();
                                                                ft1.setOnFinished(event1
                                                                        -> {
                                                                    FadeTransition ft2 = new FadeTransition(Duration.seconds(6), ismlia);
                                                                    ft2.setFromValue(1);
                                                                    ft2.setToValue(0);
                                                                    ft2.play();
                                                                    ft2.setOnFinished(event2
                                                                            -> {
                                                                        FadeTransition ft3 = new FadeTransition(Duration.seconds(6), giza);
                                                                        ft3.setFromValue(1);
                                                                        ft3.setToValue(0);
                                                                        ft3.play();
                                                                        ft3.setOnFinished(event3
                                                                                -> {
                                                                            FadeTransition ft4 = new FadeTransition(Duration.seconds(6), ghr);
                                                                            ft4.setFromValue(1);
                                                                            ft4.setToValue(0);
                                                                            ft4.play();
                                                                            ft4.setOnFinished(event4
                                                                                    -> {
                                                                                FadeTransition ft5 = new FadeTransition(Duration.seconds(6), fyom);
                                                                                ft5.setFromValue(1);
                                                                                ft5.setToValue(0);
                                                                                ft5.play();
                                                                                ft5.setOnFinished(event5 -> {
                                                                                    FadeTransition ft6 = new FadeTransition(Duration.seconds(6), bhira);
                                                                                    ft6.setFromValue(1);
                                                                                    ft6.setToValue(0);
                                                                                    ft6.play();
                                                                                    ft6.setOnFinished(event6
                                                                                            -> {
                                                                                        FadeTransition ft7 = new FadeTransition(Duration.seconds(6), demiat);
                                                                                        ft7.setFromValue(1);
                                                                                        ft7.setToValue(0);
                                                                                        ft7.play();
                                                                                        ft7.setOnFinished(event7
                                                                                                -> {
                                                                                            FadeTransition ft8 = new FadeTransition(Duration.seconds(6), dkhlia);
                                                                                            ft8.setFromValue(1);
                                                                                            ft8.setToValue(0);
                                                                                            ft8.play();
                                                                                            ft8.setOnFinished(event8
                                                                                                    -> {
                                                                                                FadeTransition ft9 = new FadeTransition(Duration.seconds(6), cairo);
                                                                                                ft9.setFromValue(1);
                                                                                                ft9.setToValue(0);
                                                                                                ft9.play();
                                                                                                ft9.setOnFinished(event9
                                                                                                        -> {
                                                                                                    FadeTransition ft01 = new FadeTransition(Duration.seconds(6), beni);
                                                                                                    ft01.setFromValue(1);
                                                                                                    ft01.setToValue(0);
                                                                                                    ft01.play();
                                                                                                    ft01.setOnFinished(event01
                                                                                                            -> {
                                                                                                        FadeTransition ft02 = new FadeTransition(Duration.seconds(6), aswan);
                                                                                                        ft02.setFromValue(1);
                                                                                                        ft02.setToValue(0);
                                                                                                        ft02.play();
                                                                                                        ft02.setOnFinished(event02
                                                                                                                -> {
                                                                                                            FadeTransition ft03 = new FadeTransition(Duration.seconds(6), alex);
                                                                                                            ft03.setFromValue(1);
                                                                                                            ft03.setToValue(0);
                                                                                                            ft03.play();
                                                                                                            ft03.setOnFinished(event03
                                                                                                                    -> {
                                                                                                                FadeTransition ft04 = new FadeTransition(Duration.seconds(6), aswan);
                                                                                                                ft04.setFromValue(1);
                                                                                                                ft04.setToValue(0);
                                                                                                                ft04.play();
                                                                                                                ft04.setOnFinished(event04
                                                                                                                        -> {
                                                                                                                    FadeTransition ft05 = new FadeTransition(Duration.seconds(6), beni);
                                                                                                                    ft05.setFromValue(1);
                                                                                                                    ft05.setToValue(0);
                                                                                                                    ft05.play();
                                                                                                                    ft05.setOnFinished(event05
                                                                                                                            -> {
                                                                                                                        FadeTransition ft06 = new FadeTransition(Duration.seconds(6), cairo);
                                                                                                                        ft01.setFromValue(1);
                                                                                                                        ft01.setToValue(0);
                                                                                                                        ft01.play();
                                                                                                                        ft06.setOnFinished(event06
                                                                                                                                -> {

                                                                                                                            FadeTransition ft07 = new FadeTransition(Duration.seconds(6), dkhlia);
                                                                                                                            ft07.setFromValue(1);
                                                                                                                            ft07.setToValue(0);
                                                                                                                            ft07.play();
                                                                                                                            ft07.setOnFinished(event07
                                                                                                                                    -> {
                                                                                                                                FadeTransition ft08 = new FadeTransition(Duration.seconds(6), demiat);
                                                                                                                                ft08.setFromValue(1);
                                                                                                                                ft08.setToValue(0);
                                                                                                                                ft08.play();
                                                                                                                                ft08.setOnFinished(event08
                                                                                                                                        -> {
                                                                                                                                    FadeTransition ft09 = new FadeTransition(Duration.seconds(6), bhira);
                                                                                                                                    ft09.setFromValue(1);
                                                                                                                                    ft09.setToValue(0);
                                                                                                                                    ft09.play();
                                                                                                                                    ft09.setOnFinished(event09
                                                                                                                                            -> {
                                                                                                                                        FadeTransition ft10 = new FadeTransition(Duration.seconds(6), fyom);
                                                                                                                                        ft10.setFromValue(1);
                                                                                                                                        ft10.setToValue(0);
                                                                                                                                        ft10.play();
                                                                                                                                        ft10.setOnFinished(event10
                                                                                                                                                -> {
                                                                                                                                            FadeTransition ft11 = new FadeTransition(Duration.seconds(6), ghr);
                                                                                                                                            ft11.setFromValue(1);
                                                                                                                                            ft11.setToValue(0);
                                                                                                                                            ft11.play();
                                                                                                                                            ft11.setOnFinished(event11 -> {
                                                                                                                                                FadeTransition ft12 = new FadeTransition(Duration.seconds(6), giza);
                                                                                                                                                ft12.setFromValue(1);
                                                                                                                                                ft12.setToValue(0);
                                                                                                                                                ft12.play();
                                                                                                                                                ft12.setOnFinished(event12
                                                                                                                                                        -> {
                                                                                                                                                    FadeTransition ft13 = new FadeTransition(Duration.seconds(6), ismlia);
                                                                                                                                                    ft13.setFromValue(1);
                                                                                                                                                    ft13.setToValue(0);
                                                                                                                                                    ft13.play();
                                                                                                                                                    ft13.setOnFinished(event13
                                                                                                                                                            -> {
                                                                                                                                                        FadeTransition ft14 = new FadeTransition(Duration.seconds(6), ksh);
                                                                                                                                                        ft14.setFromValue(1);
                                                                                                                                                        ft14.setToValue(0);
                                                                                                                                                        ft14.play();
                                                                                                                                                        ft14.setOnFinished(event14
                                                                                                                                                                -> {
                                                                                                                                                            FadeTransition ft15 = new FadeTransition(Duration.seconds(6), lux);
                                                                                                                                                            ft15.setFromValue(1);
                                                                                                                                                            ft15.setToValue(0);
                                                                                                                                                            ft15.play();
                                                                                                                                                            ft15.setOnFinished(event15
                                                                                                                                                                    -> {
                                                                                                                                                                FadeTransition a = new FadeTransition(Duration.seconds(6), meno);
                                                                                                                                                                a.setFromValue(1);
                                                                                                                                                                a.setToValue(0);
                                                                                                                                                                a.play();
                                                                                                                                                                a.setOnFinished(eventa
                                                                                                                                                                        -> {
                                                                                                                                                                    FadeTransition b = new FadeTransition(Duration.seconds(6), mnia);
                                                                                                                                                                    b.setFromValue(1);
                                                                                                                                                                    b.setToValue(0);
                                                                                                                                                                    b.play();
                                                                                                                                                                    b.setOnFinished(eventb
                                                                                                                                                                            -> {

                                                                                                                                                                        FadeTransition c = new FadeTransition(Duration.seconds(6), mtroh);
                                                                                                                                                                        c.setFromValue(1);
                                                                                                                                                                        c.setToValue(0);
                                                                                                                                                                        c.play();
                                                                                                                                                                        c.setOnFinished(eventc
                                                                                                                                                                                -> {
                                                                                                                                                                            FadeTransition d = new FadeTransition(Duration.seconds(6), newvly);
                                                                                                                                                                            d.setFromValue(1);
                                                                                                                                                                            d.setToValue(0);
                                                                                                                                                                            d.play();
                                                                                                                                                                            d.setOnFinished(eventd
                                                                                                                                                                                    -> {

                                                                                                                                                                                FadeTransition e = new FadeTransition(Duration.seconds(6), norths);
                                                                                                                                                                                e.setFromValue(1);
                                                                                                                                                                                e.setToValue(0);
                                                                                                                                                                                e.play();
                                                                                                                                                                                e.setOnFinished(evente
                                                                                                                                                                                        -> {
                                                                                                                                                                                    FadeTransition f = new FadeTransition(Duration.seconds(6), port);
                                                                                                                                                                                    f.setFromValue(1);
                                                                                                                                                                                    f.setToValue(0);
                                                                                                                                                                                    f.play();
                                                                                                                                                                                    f.setOnFinished(eventf
                                                                                                                                                                                            -> {
                                                                                                                                                                                        FadeTransition g = new FadeTransition(Duration.seconds(6), kna);
                                                                                                                                                                                        g.setFromValue(1);
                                                                                                                                                                                        g.setToValue(0);
                                                                                                                                                                                        g.play();
                                                                                                                                                                                        g.setOnFinished(eventg
                                                                                                                                                                                                -> {
                                                                                                                                                                                            FadeTransition h = new FadeTransition(Duration.seconds(6), qlu);
                                                                                                                                                                                            h.setFromValue(1);
                                                                                                                                                                                            h.setToValue(0);
                                                                                                                                                                                            h.play();
                                                                                                                                                                                            h.setOnFinished(eventh
                                                                                                                                                                                                    -> {
                                                                                                                                                                                                FadeTransition i = new FadeTransition(Duration.seconds(6), shrk);
                                                                                                                                                                                                i.setFromValue(1);
                                                                                                                                                                                                i.setToValue(0);
                                                                                                                                                                                                i.play();
                                                                                                                                                                                                i.setOnFinished(eventi
                                                                                                                                                                                                        -> {
                                                                                                                                                                                                    FadeTransition jj = new FadeTransition(Duration.seconds(6), shag);
                                                                                                                                                                                                    jj.setFromValue(1);
                                                                                                                                                                                                    jj.setToValue(0);
                                                                                                                                                                                                    jj.play();
                                                                                                                                                                                                    jj.setOnFinished(eventjj
                                                                                                                                                                                                            -> {
                                                                                                                                                                                                        FadeTransition k = new FadeTransition(Duration.seconds(6), ss);
                                                                                                                                                                                                        k.setFromValue(1);
                                                                                                                                                                                                        k.setToValue(0);
                                                                                                                                                                                                        k.play();
                                                                                                                                                                                                        k.setOnFinished(eventk
                                                                                                                                                                                                                -> {
                                                                                                                                                                                                            FadeTransition l = new FadeTransition(Duration.seconds(6), s);
                                                                                                                                                                                                            l.setFromValue(1);
                                                                                                                                                                                                            l.setToValue(0);
                                                                                                                                                                                                            l.play();
                                                                                                                                                                                                            l.setOnFinished(eventl
                                                                                                                                                                                                                    -> {
                                                                                                                                                                                                                FadeTransition m = new FadeTransition(Duration.seconds(6), suez);
                                                                                                                                                                                                                m.setFromValue(1);
                                                                                                                                                                                                                m.setToValue(0);
                                                                                                                                                                                                                m.play();
                                                                                                                                                                                                                m.setOnFinished(eventm
                                                                                                                                                                                                                        -> {

                                                                                                                                                                                                                    SliderAnimation();

                                                                                                                                                                                                                });

                                                                                                                                                                                                            });
                                                                                                                                                                                                        });

                                                                                                                                                                                                    });
                                                                                                                                                                                                });
                                                                                                                                                                                            });
                                                                                                                                                                                        });
                                                                                                                                                                                    });
                                                                                                                                                                                });
                                                                                                                                                                            });
                                                                                                                                                                        });
                                                                                                                                                                    });
                                                                                                                                                                });
                                                                                                                                                            });
                                                                                                                                                        });
                                                                                                                                                    });
                                                                                                                                                });
                                                                                                                                            });
                                                                                                                                        });
                                                                                                                                    });
                                                                                                                                });
                                                                                                                            });
                                                                                                                        });
                                                                                                                    });
                                                                                                                });

                                                                                                            });
                                                                                                        });
                                                                                                    });
                                                                                                });
                                                                                            });
                                                                                        });
                                                                                    });
                                                                                });
                                                                            });
                                                                        });
                                                                    });
                                                                });
                                                            });
                                                        });
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });
            });
        });
    }
}
