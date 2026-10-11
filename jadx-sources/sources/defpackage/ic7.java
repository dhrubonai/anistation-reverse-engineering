package defpackage;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ic7 extends Fragment {
    public final qb7 x = new qb7((byte) 4);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.x.y).values().iterator();
        while (it.hasNext()) {
            ((ta7) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.x.y).values().iterator();
        if (!it.hasNext()) {
            return;
        }
        ((ta7) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        for (Map.Entry entry : ((Map) this.x.y).entrySet()) {
            ta7 ta7Var = (ta7) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            ta7Var.b(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = ((Map) this.x.y).values().iterator();
        while (it.hasNext()) {
            ((ta7) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator it = ((Map) this.x.y).values().iterator();
        while (it.hasNext()) {
            ((ta7) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            Iterator it = ((Map) this.x.y).entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((ta7) entry.getValue()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        for (ta7 ta7Var : ((Map) this.x.y).values()) {
            ta7Var.x = true;
            ta7Var.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator it = ((Map) this.x.y).values().iterator();
        while (it.hasNext()) {
            ((ta7) it.next()).c();
        }
    }
}
