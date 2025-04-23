# leetcode
leetcode 刷题记录

### 插件配置
CodeFileName:
```
P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})
```

CodeTemplate:
```
package leetcode.editor.${question.endpointType};

public class P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug}) {

    public static void main(String[] args) {
        Solution solution = new P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        // put your test code here
        
    }
    
    ${question.codeWithIndent(4)}
}

```