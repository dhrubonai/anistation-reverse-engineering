package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w37 {
    public static final x37 a;

    static {
        x37 nr1Var;
        try {
            nr1Var = new sn3(t80.t(WebViewProviderFactoryBoundaryInterface.class, nu5.i()), (byte) 28);
        } catch (ClassNotFoundException unused) {
            nr1Var = new nr1((byte) 7);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        a = nr1Var;
    }
}
