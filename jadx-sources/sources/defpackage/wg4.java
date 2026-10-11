package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wg4 {
    public static final wg4 x;
    public static final wg4 y;
    public static final /* synthetic */ wg4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wg4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wg4] */
    static {
        ?? r0 = new Enum("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        x = r0;
        ?? r1 = new Enum("DROP_WORK_REQUEST", 1);
        y = r1;
        z = new wg4[]{r0, r1};
    }

    public static wg4 valueOf(String str) {
        return (wg4) Enum.valueOf(wg4.class, str);
    }

    public static wg4[] values() {
        return (wg4[]) z.clone();
    }
}
