package com.group5.sep3.util;

import java.beans.PropertyChangeListener;

public interface Subject {

    void addListener(String name, PropertyChangeListener listener);

    void addListener(PropertyChangeListener listener);

    void removeListener(String name, PropertyChangeListener listener);

    void removeListener(PropertyChangeListener listener);
}
