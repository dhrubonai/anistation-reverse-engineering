package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ms4 implements gs4 {
    public static final is4 x;
    public static final /* synthetic */ ms4[] y;

    static {
        is4 is4Var = new is4();
        x = is4Var;
        y = new ms4[]{is4Var, new ms4() { // from class: js4
            @Override // defpackage.gs4
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new ms4() { // from class: ks4
            @Override // defpackage.gs4
            public final boolean apply(Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new ms4() { // from class: ls4
            @Override // defpackage.gs4
            public final boolean apply(Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static ms4 valueOf(String str) {
        return (ms4) Enum.valueOf(ms4.class, str);
    }

    public static ms4[] values() {
        return (ms4[]) y.clone();
    }
}
