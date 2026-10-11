package com.google.android.gms.tasks;

/* loaded from: classes.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j4) {
        this.zza = j4;
    }

    public static void createAndAddCallback(Task<Object> task, long j4) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j4));
    }

    public native void nativeOnComplete(long j4, Object obj, boolean z9, boolean z10, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (!task.isCanceled() && (exception = task.getException()) != null) {
            str = exception.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
