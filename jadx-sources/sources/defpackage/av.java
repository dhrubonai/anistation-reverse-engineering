package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class av implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;

    public /* synthetic */ av(Context context, byte b) {
        this.x = b;
        this.y = context;
    }

    @Override // defpackage.r26
    public final Object get() {
        n71 n71Var;
        Context applicationContext;
        byte b = this.x;
        Context context = this.y;
        switch (b) {
            case 0:
                return iv.y(context);
            case 1:
                return new y91(context, new q81());
            case 2:
                return new y91(context, new q81());
            case 3:
                return new mb1(context);
            case 4:
                o15 o15Var = n71.M;
                synchronized (n71.class) {
                    n71Var = n71.S;
                    if (n71Var == null) {
                        if (context == null) {
                            applicationContext = null;
                        } else {
                            applicationContext = context.getApplicationContext();
                        }
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        hashMap.put(2, -9223372036854775807L);
                        hashMap.put(3, -9223372036854775807L);
                        hashMap.put(4, -9223372036854775807L);
                        hashMap.put(5, -9223372036854775807L);
                        hashMap.put(10, -9223372036854775807L);
                        hashMap.put(9, -9223372036854775807L);
                        hashMap.put(7, -9223372036854775807L);
                        n71Var = new n71(applicationContext, hashMap);
                        n71.S = n71Var;
                    }
                }
                return n71Var;
            default:
                return new fa1(context);
        }
    }
}
