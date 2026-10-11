.class public final synthetic Lcom/google/firebase/concurrent/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/firebase/concurrent/a;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/firebase/concurrent/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/firebase/concurrent/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/firebase/concurrent/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/a;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/concurrent/a;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    check-cast v2, Ljava/util/concurrent/Callable;

    check-cast v1, Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->l(Ljava/util/concurrent/Callable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/concurrent/CustomThreadFactory;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/CustomThreadFactory;->a(Lcom/google/firebase/concurrent/CustomThreadFactory;Ljava/lang/Runnable;)V

    return-void

    :goto_0
    check-cast v2, Lcom/google/firebase/concurrent/LimitedConcurrencyExecutor;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/LimitedConcurrencyExecutor;->a(Lcom/google/firebase/concurrent/LimitedConcurrencyExecutor;Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
