package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m05 implements lg3 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ m05(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ga5 ga5Var = (ga5) obj;
                if (dg3Var == dg3.ON_CREATE) {
                    og3Var.getLifecycle().b(this);
                    Bundle a = ga5Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a != null) {
                        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i = 0;
                            while (i < size) {
                                String str = stringArrayList.get(i);
                                i++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, m05.class.getClassLoader()).asSubclass(ca5.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            if (ga5Var instanceof ew6) {
                                                cw6 viewModelStore = ((ew6) ga5Var).getViewModelStore();
                                                ea5 savedStateRegistry = ga5Var.getSavedStateRegistry();
                                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                                LinkedHashMap linkedHashMap2 = viewModelStore.a;
                                                Iterator it = yo0.N0(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    vv6 vv6Var = (vv6) linkedHashMap2.get(it.next());
                                                    if (vv6Var != null) {
                                                        io3.h(vv6Var, savedStateRegistry, ga5Var.getLifecycle());
                                                    }
                                                }
                                                if (!yo0.N0(linkedHashMap2.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                ov3.l(ga5Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            ov3.k(zo5.l("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    ov3.k(qx1.m("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        ze0.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                yr0 yr0Var = (yr0) obj;
                yr0.access$ensureViewModelStore(yr0Var);
                yr0Var.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                qd2[] qd2VarArr = (qd2[]) obj;
                if (qd2VarArr.length <= 0) {
                    if (qd2VarArr.length <= 0) {
                        return;
                    }
                    qd2 qd2Var = qd2VarArr[0];
                    throw null;
                }
                qd2 qd2Var2 = qd2VarArr[0];
                throw null;
            default:
                if (dg3Var == dg3.ON_CREATE) {
                    og3Var.getLifecycle().b(this);
                    ((aa5) obj).b();
                    return;
                } else {
                    ov3.l(dg3Var, "Next event must be ON_CREATE, it was ");
                    return;
                }
        }
    }
}
