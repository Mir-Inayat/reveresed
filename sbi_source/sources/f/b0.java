package f;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        f0.d nVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                nVar = new androidx.emoji2.text.n(clipData, 3);
            } else {
                f0.e eVar = new f0.e();
                eVar.f1239b = clipData;
                eVar.c = 3;
                nVar = eVar;
            }
            f0.m0.f(textView, nVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        f0.d nVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            nVar = new androidx.emoji2.text.n(clipData, 3);
        } else {
            f0.e eVar = new f0.e();
            eVar.f1239b = clipData;
            eVar.c = 3;
            nVar = eVar;
        }
        f0.m0.f(view, nVar.build());
        return true;
    }
}
