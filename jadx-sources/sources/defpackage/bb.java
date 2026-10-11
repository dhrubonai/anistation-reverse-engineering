package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bb {
    public static final bb a = new Object();

    public final void a(View view, sq4 sq4Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (sq4Var instanceof qd) {
            systemIcon = PointerIcon.getSystemIcon(context, ((qd) sq4Var).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        }
        if (!a34.i(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
