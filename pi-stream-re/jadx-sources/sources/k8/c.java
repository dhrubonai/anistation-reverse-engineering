package k8;

import android.content.ClipData;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ClipData newPlainText = ClipData.newPlainText("", "");
        View.DragShadowBuilder dragShadowBuilder = new View.DragShadowBuilder(view);
        if (Build.VERSION.SDK_INT >= 24) {
            view.startDragAndDrop(newPlainText, dragShadowBuilder, view, 0);
            return true;
        }
        view.startDrag(newPlainText, dragShadowBuilder, view, 0);
        return true;
    }
}
