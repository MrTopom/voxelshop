package com.vitco.engine.data.container;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Collection of all the persistent data
 *
 * IMPORTANT: This class should never be changes!
 */
public final class DataContainer implements Serializable {
    private static final long serialVersionUID = 1L;
    // ###################### DATA (Voxel)
    // holds all layers (layers map to voxel ids)
    public int selectedLayer = -1;
    public final HashMap<Integer, VoxelLayer> layers = new HashMap<Integer, VoxelLayer>();
    // order of the layers
    public final ArrayList<Integer> layerOrder = new ArrayList<Integer>();
    // holds all voxels (maps id to voxel)
    public final HashMap<Integer, Voxel> voxels = new HashMap<Integer, Voxel>();

    // ####################### DATA (Animation)
    // holds the points
    public final HashMap<Integer, ExtendedVector> points = new HashMap<Integer, ExtendedVector>();
    // holds the lines
    public final HashMap<String, ExtendedLine> lines = new HashMap<String, ExtendedLine>();
    // maps the points to lines
    public final HashMap<Integer, ArrayList<ExtendedLine>> pointsToLines = new HashMap<Integer, ArrayList<ExtendedLine>>();
    // currently active frame
    public int activeFrame = -1;
    // all frames
    public final HashMap<Integer, Frame> frames = new HashMap<Integer, Frame>();
}
