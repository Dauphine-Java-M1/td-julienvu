package fr.dauphine.ja.vujulien.shapes;

import fr.dauphine.ja.vujulien.shapes.model.Observable;

public interface Observer {
	public void update();
	public void setObservable(Observable obs);
}
