package coil3.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.a34;
import defpackage.og3;
import defpackage.zd2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ImageViewTarget extends zd2 {
    private final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        this.view = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ImageViewTarget) && a34.i(this.view, ((ImageViewTarget) obj).view)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zd2, defpackage.aj6
    public Drawable getDrawable() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return this.view.hashCode();
    }

    @Override // defpackage.m91
    public void onCreate(og3 og3Var) {
        og3Var.getClass();
    }

    @Override // defpackage.m91
    public void onDestroy(og3 og3Var) {
        og3Var.getClass();
    }

    @Override // defpackage.m91
    public void onPause(og3 og3Var) {
        og3Var.getClass();
    }

    @Override // defpackage.m91
    public void onResume(og3 og3Var) {
        og3Var.getClass();
    }

    @Override // defpackage.zd2
    public void setDrawable(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public String toString() {
        return "ImageViewTarget(view=" + this.view + ")";
    }

    @Override // defpackage.zd2, defpackage.aj6
    public ImageView getView() {
        return this.view;
    }
}
