package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class s41 extends IOException {
    public final int x;

    public s41(int i) {
        this.x = i;
    }

    public s41(Exception exc, int i) {
        super(exc);
        this.x = i;
    }

    public s41(String str, int i) {
        super(str);
        this.x = i;
    }

    public s41(String str, Exception exc, int i) {
        super(str, exc);
        this.x = i;
    }
}
