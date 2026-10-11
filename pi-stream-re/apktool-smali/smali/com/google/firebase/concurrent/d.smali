.class public final synthetic Lcom/google/firebase/concurrent/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

.field public final synthetic c:Ljava/lang/Runnable;

.field public final synthetic d:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/google/firebase/concurrent/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/firebase/concurrent/d;->b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/firebase/concurrent/d;->c:Ljava/lang/Runnable;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/google/firebase/concurrent/d;->d:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/firebase/concurrent/d;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/d;->b:Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;

    iget-object v2, p0, Lcom/google/firebase/concurrent/d;->d:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    iget-object v3, p0, Lcom/google/firebase/concurrent/d;->c:Ljava/lang/Runnable;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {v1, v3, v2}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->k(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :pswitch_1
    invoke-static {v1, v3, v2}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->f(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :goto_0
    invoke-static {v1, v3, v2}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->c(Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
