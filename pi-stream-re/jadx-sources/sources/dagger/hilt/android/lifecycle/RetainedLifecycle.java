package dagger.hilt.android.lifecycle;

/* loaded from: classes.dex */
public interface RetainedLifecycle {

    /* loaded from: classes.dex */
    public interface OnClearedListener {
        void onCleared();
    }

    void addOnClearedListener(OnClearedListener onClearedListener);

    void removeOnClearedListener(OnClearedListener onClearedListener);
}
