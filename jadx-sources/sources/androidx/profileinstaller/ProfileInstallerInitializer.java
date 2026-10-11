package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.q18;
import defpackage.vu4;
import defpackage.yy2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements yy2 {
    @Override // defpackage.yy2
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new vu4(this, context.getApplicationContext()));
        return new q18((byte) 28);
    }

    @Override // defpackage.yy2
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
