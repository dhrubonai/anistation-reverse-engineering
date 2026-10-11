package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ax5 implements x11, vz0 {
    public static final ax5 x = new Object();

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        return null;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return it1.x;
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
