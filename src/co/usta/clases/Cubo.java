package co.usta.clases;

import java.io.Serializable;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class Cubo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	SimpleUniverse universe;
	BranchGroup group;
	ColorCube colorCube;
	TransformGroup transformGroup;
	Transform3D transform3d;
	
	public Cubo() {
		universe = new SimpleUniverse();
		group = new BranchGroup();
		colorCube = new ColorCube(0.5);
		transformGroup = new TransformGroup();
		transform3d = new Transform3D();
	}
	
	public void crearCubo() {
		transformGroup.setTransform(transform3d);
		transformGroup.addChild(colorCube);
		group.addChild(transformGroup);
		universe.getViewingPlatform().setNominalViewingTransform();
		universe.addBranchGraph(group);
	}

}
