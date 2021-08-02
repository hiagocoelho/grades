package com.example.grades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteAnalyzerTest {

      @Test
      public void approved() {
          NoteAnalyzer noteAnalyzer = new NoteAnalyzer(false, 10, 10, 10, 10, 0);
          assertEquals("Aprovado.", noteAnalyzer.analyze());
      }

      @Test
      public void finalExam() {
          NoteAnalyzer noteAnalyzer = new NoteAnalyzer(false, 4, 4, 4, 4, 0);
          assertEquals("Prova final.", noteAnalyzer.analyze());
      }

      @Test
      public void reproved() {
          NoteAnalyzer noteAnalyzer = new NoteAnalyzer(false, 1, 1, 1, 1, 0);
          assertEquals("Reprovado.", noteAnalyzer.analyze());
      }

    @Test
    public void finalExamApproved() {
        NoteAnalyzer noteAnalyzer = new NoteAnalyzer(true, 4, 4, 4, 4, 8);
        assertEquals("Aprovado na prova final.", noteAnalyzer.analyze());
    }

    @Test
    public void finalExamReproved() {
        NoteAnalyzer noteAnalyzer = new NoteAnalyzer(true, 4, 4, 4, 4, 7);
        assertEquals("Reprovado na prova final.", noteAnalyzer.analyze());
    }

}